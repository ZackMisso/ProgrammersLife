//
//  Feature.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Feature.h"

@implementation Feature

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

// getter methods
-(float)getFeatureDesignScore { return featureDesignScore; }
-(float)getDifficulty { return difficulty; }
-(int)getNumberOfAdditionsNeededAtBest { return numberOfAdditionsNeededAtBest; }
-(int)getNumberOfAdditionsMade { return numberOfAdditionsMade; }
-(int)getNumberOfDeletionsMade { return numberOfDeletionsMade; }

// setter methods
-(void)setFeatureDesignScore:(float)value { featureDesignScore = value; }
-(void)setDifficulty:(float)value { difficulty = value; }
-(void)setNumberOfAdditionsNeededAtBest:(int)value { numberOfAdditionsNeededAtBest = value; }
-(void)setNumberOfAdditionsMade:(int)value { numberOfAdditionsMade = value; }
-(void)setNumberOfDeletuibsMade:(int)value { numberOfDeletionsMade = value; }

@end
