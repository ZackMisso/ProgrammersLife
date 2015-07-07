//
//  Feature.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface Feature : NSObject{
    float featureDesignScore;
    int numberOfAdditionsNeededAtBest;
    int numberOfAdditionsMade;
    int numberOfDeletionsMade;
}

// getter methods
-(float)getFeatureDesignScore;
-(int)getNumberOfAdditionsNeededAtBest;
-(int)getNumberOfAdditionsMade;
-(int)getNumberOfDeletionsMade;

// setter methods
-(void)setFeatureDesignScore:(float)value;
-(void)setNumberOfAdditionsNeededAtBest:(int)value;
-(void)setNumberOfAdditionsMade:(int)value;
-(void)setNumberOfDeletuibsMade:(int)value;

@end